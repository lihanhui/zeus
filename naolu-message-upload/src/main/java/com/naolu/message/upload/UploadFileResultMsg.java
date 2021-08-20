package com.naolu.message.upload;

public class UploadFileResultMsg {
	private String fullUri;
	private String file;
	public String getFullUri() {
		return fullUri;
	}
	public void setFullUri(String fullUri) {
		this.fullUri = fullUri;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "UploadFileResultMsg [fullUri=" + fullUri + ", file=" + file + "]";
	}
	public UploadFileResultMsg(String fullUri, String file) {
		super();
		this.fullUri = fullUri;
		this.file = file;
	}
	public UploadFileResultMsg() {
		super();
	}
}
