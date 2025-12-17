package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CloudUpload: ImageVector
    get() {
        if (_CloudUpload != null) return _CloudUpload!!
        
        _CloudUpload = ImageVector.Builder(
            name = "cloud-upload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.406f, 1.342f)
                arcTo(5.53f, 5.53f, 0f, false, true, 8f, 0f)
                curveToRelative(2.69f, 0f, 4.923f, 2f, 5.166f, 4.579f)
                curveTo(14.758f, 4.804f, 16f, 6.137f, 16f, 7.773f)
                curveTo(16f, 9.569f, 14.502f, 11f, 12.687f, 11f)
                horizontalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2.688f)
                curveTo(13.979f, 10f, 15f, 8.988f, 15f, 7.773f)
                curveToRelative(0f, -1.216f, -1.02f, -2.228f, -2.313f, -2.228f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveTo(12.188f, 2.825f, 10.328f, 1f, 8f, 1f)
                arcToRelative(4.53f, 4.53f, 0f, false, false, -2.941f, 1.1f)
                curveToRelative(-0.757f, 0.652f, -1.153f, 1.438f, -1.153f, 2.055f)
                verticalLineToRelative(0.448f)
                lineToRelative(-0.445f, 0.049f)
                curveTo(2.064f, 4.805f, 1f, 5.952f, 1f, 7.318f)
                curveTo(1f, 8.785f, 2.23f, 10f, 3.781f, 10f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(3.781f)
                curveTo(1.708f, 11f, 0f, 9.366f, 0f, 7.318f)
                curveToRelative(0f, -1.763f, 1.266f, -3.223f, 2.942f, -3.593f)
                curveToRelative(0.143f, -0.863f, 0.698f, -1.723f, 1.464f, -2.383f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.646f, 4.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8.5f, 5.707f)
                verticalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(5.707f)
                lineTo(5.354f, 7.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                close()
            }
        }.build()
        
        return _CloudUpload!!
    }

private var _CloudUpload: ImageVector? = null

