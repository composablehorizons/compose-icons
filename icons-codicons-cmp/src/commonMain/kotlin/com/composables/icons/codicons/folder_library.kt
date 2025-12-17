package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FolderLibrary: ImageVector
    get() {
        if (_FolderLibrary != null) return _FolderLibrary!!
        
        _FolderLibrary = ImageVector.Builder(
            name = "folder-library",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.20702f, 4f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 4f, 15f, 5.119f, 15f, 6.5f)
                verticalLineTo(11.5f)
                curveTo(15f, 12.881f, 13.881f, 14f, 12.5f, 14f)
                horizontalLineTo(10.113f)
                curveTo(10.1068f, 13.9809f, 10.1016f, 13.9615f, 10.0964f, 13.9421f)
                curveTo(10.0883f, 13.9117f, 10.0802f, 13.8813f, 10.068f, 13.852f)
                lineTo(9.71502f, 13f)
                horizontalLineTo(12.5f)
                curveTo(13.328f, 13f, 14f, 12.328f, 14f, 11.5f)
                verticalLineTo(6.5f)
                curveTo(14f, 5.672f, 13.328f, 5f, 12.5f, 5f)
                horizontalLineTo(8.20702f)
                lineTo(6.64602f, 6.561f)
                curveTo(6.36402f, 6.842f, 5.98302f, 7f, 5.58502f, 7f)
                horizontalLineTo(0.999023f)
                verticalLineTo(4.5f)
                curveTo(0.999023f, 3.119f, 2.11802f, 2f, 3.49902f, 2f)
                horizontalLineTo(5.58502f)
                curveTo(5.98302f, 2f, 6.36502f, 2.158f, 6.64602f, 2.439f)
                lineTo(8.20702f, 4f)
                close()
                moveTo(5.58502f, 6f)
                curveTo(5.71802f, 6f, 5.84502f, 5.948f, 5.93902f, 5.854f)
                lineTo(7.29302f, 4.5f)
                lineTo(5.93902f, 3.146f)
                curveTo(5.84502f, 3.053f, 5.71802f, 3f, 5.58502f, 3f)
                horizontalLineTo(3.49902f)
                curveTo(2.67102f, 3f, 1.99902f, 3.672f, 1.99902f, 4.5f)
                verticalLineTo(6f)
                horizontalLineTo(5.58502f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.766f, 9.271f)
                curveTo(7.011f, 9.372f, 7.207f, 9.565f, 7.311f, 9.809f)
                lineTo(9.144f, 14.234f)
                curveTo(9.196f, 14.355f, 9.224f, 14.485f, 9.224f, 14.617f)
                curveTo(9.224f, 14.814f, 9.166f, 15.008f, 9.056f, 15.172f)
                curveTo(8.946f, 15.337f, 8.791f, 15.465f, 8.608f, 15.541f)
                lineTo(7.683f, 15.924f)
                curveTo(7.561f, 15.974f, 7.431f, 16f, 7.3f, 16f)
                curveTo(7.102f, 16f, 6.908f, 15.941f, 6.743f, 15.832f)
                curveTo(6.578f, 15.723f, 6.449f, 15.566f, 6.373f, 15.383f)
                lineTo(5f, 12.07f)
                verticalLineTo(15f)
                curveTo(5f, 15.265f, 4.895f, 15.519f, 4.707f, 15.707f)
                curveTo(4.52f, 15.895f, 4.265f, 16f, 4f, 16f)
                horizontalLineTo(3f)
                curveTo(2.824f, 16f, 2.652f, 15.954f, 2.5f, 15.865f)
                curveTo(2.348f, 15.954f, 2.176f, 16f, 2f, 16f)
                horizontalLineTo(1f)
                curveTo(0.735f, 16f, 0.481f, 15.895f, 0.293f, 15.707f)
                curveTo(0.105f, 15.52f, 0f, 15.265f, 0f, 15f)
                verticalLineTo(9f)
                curveTo(0f, 8.735f, 0.106f, 8.481f, 0.293f, 8.293f)
                curveTo(0.48f, 8.105f, 0.735f, 8f, 1f, 8f)
                horizontalLineTo(2f)
                curveTo(2.176f, 8f, 2.348f, 8.046f, 2.5f, 8.135f)
                curveTo(2.652f, 8.046f, 2.824f, 8f, 3f, 8f)
                horizontalLineTo(4f)
                curveTo(4.265f, 8f, 4.519f, 8.106f, 4.707f, 8.293f)
                curveTo(4.895f, 8.48f, 5f, 8.735f, 5f, 9f)
                verticalLineTo(9.688f)
                curveTo(5.025f, 9.674f, 5.051f, 9.661f, 5.078f, 9.65f)
                lineTo(6f, 9.268f)
                curveTo(6.246f, 9.169f, 6.521f, 9.17f, 6.766f, 9.271f)
                close()
                moveTo(1f, 15f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(1f)
                verticalLineTo(15f)
                close()
                moveTo(3f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                close()
                moveTo(5.463f, 10.574f)
                lineTo(7.3f, 15f)
                lineTo(8.22f, 14.617f)
                lineTo(6.385f, 10.192f)
                lineTo(5.463f, 10.574f)
                close()
            }
        }.build()
        
        return _FolderLibrary!!
    }

private var _FolderLibrary: ImageVector? = null

