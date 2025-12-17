package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CloudSlash: ImageVector
    get() {
        if (_CloudSlash != null) return _CloudSlash!!
        
        _CloudSlash = ImageVector.Builder(
            name = "cloud-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.112f, 5.112f)
                arcToRelative(3f, 3f, 0f, false, false, -0.17f, 0.613f)
                curveTo(1.266f, 6.095f, 0f, 7.555f, 0f, 9.318f)
                curveTo(0f, 11.366f, 1.708f, 13f, 3.781f, 13f)
                horizontalLineTo(11f)
                lineToRelative(-1f, -1f)
                horizontalLineTo(3.781f)
                curveTo(2.231f, 12f, 1f, 10.785f, 1f, 9.318f)
                curveToRelative(0f, -1.365f, 1.064f, -2.513f, 2.46f, -2.666f)
                lineToRelative(0.446f, -0.05f)
                verticalLineToRelative(-0.447f)
                quadToRelative(0f, -0.113f, 0.018f, -0.231f)
                close()
                moveToRelative(2.55f, -1.45f)
                lineToRelative(-0.725f, -0.725f)
                arcTo(5.5f, 5.5f, 0f, false, true, 8f, 2f)
                curveToRelative(2.69f, 0f, 4.923f, 2f, 5.166f, 4.579f)
                curveTo(14.758f, 6.804f, 16f, 8.137f, 16f, 9.773f)
                arcToRelative(3.2f, 3.2f, 0f, false, true, -1.516f, 2.711f)
                lineToRelative(-0.733f, -0.733f)
                curveTo(14.498f, 11.378f, 15f, 10.626f, 15f, 9.773f)
                curveToRelative(0f, -1.216f, -1.02f, -2.228f, -2.313f, -2.228f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveTo(12.188f, 4.825f, 10.328f, 3f, 8f, 3f)
                curveToRelative(-0.875f, 0f, -1.678f, 0.26f, -2.339f, 0.661f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.646f, 14.354f)
                lineToRelative(-12f, -12f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(12f, 12f)
                close()
            }
        }.build()
        
        return _CloudSlash!!
    }

private var _CloudSlash: ImageVector? = null

