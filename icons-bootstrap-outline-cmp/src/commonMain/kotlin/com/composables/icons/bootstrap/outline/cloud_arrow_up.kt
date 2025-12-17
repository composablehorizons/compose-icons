package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CloudArrowUp: ImageVector
    get() {
        if (_CloudArrowUp != null) return _CloudArrowUp!!
        
        _CloudArrowUp = ImageVector.Builder(
            name = "cloud-arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.646f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8.5f, 6.707f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(6.707f)
                lineTo(6.354f, 7.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.406f, 3.342f)
                arcTo(5.53f, 5.53f, 0f, false, true, 8f, 2f)
                curveToRelative(2.69f, 0f, 4.923f, 2f, 5.166f, 4.579f)
                curveTo(14.758f, 6.804f, 16f, 8.137f, 16f, 9.773f)
                curveTo(16f, 11.569f, 14.502f, 13f, 12.687f, 13f)
                horizontalLineTo(3.781f)
                curveTo(1.708f, 13f, 0f, 11.366f, 0f, 9.318f)
                curveToRelative(0f, -1.763f, 1.266f, -3.223f, 2.942f, -3.593f)
                curveToRelative(0.143f, -0.863f, 0.698f, -1.723f, 1.464f, -2.383f)
                moveToRelative(0.653f, 0.757f)
                curveToRelative(-0.757f, 0.653f, -1.153f, 1.44f, -1.153f, 2.056f)
                verticalLineToRelative(0.448f)
                lineToRelative(-0.445f, 0.049f)
                curveTo(2.064f, 6.805f, 1f, 7.952f, 1f, 9.318f)
                curveTo(1f, 10.785f, 2.23f, 12f, 3.781f, 12f)
                horizontalLineToRelative(8.906f)
                curveTo(13.98f, 12f, 15f, 10.988f, 15f, 9.773f)
                curveToRelative(0f, -1.216f, -1.02f, -2.228f, -2.313f, -2.228f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveTo(12.188f, 4.825f, 10.328f, 3f, 8f, 3f)
                arcToRelative(4.53f, 4.53f, 0f, false, false, -2.941f, 1.1f)
                close()
            }
        }.build()
        
        return _CloudArrowUp!!
    }

private var _CloudArrowUp: ImageVector? = null

