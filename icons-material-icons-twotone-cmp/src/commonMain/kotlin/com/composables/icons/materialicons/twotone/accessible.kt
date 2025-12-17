package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Accessible: ImageVector
    get() {
        if (_Accessible != null) return _Accessible!!
        
        _Accessible = ImageVector.Builder(
            name = "accessible",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4f)
                arcTo(2f, 2f, 0f, false, true, 12f, 6f)
                arcTo(2f, 2f, 0f, false, true, 10f, 4f)
                arcTo(2f, 2f, 0f, false, true, 14f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 13f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.54f, 0.02f, -3.09f, -0.75f, -4.07f, -1.83f)
                lineToRelative(-1.29f, -1.43f)
                curveToRelative(-0.17f, -0.19f, -0.38f, -0.34f, -0.61f, -0.45f)
                curveToRelative(-0.01f, 0f, -0.01f, -0.01f, -0.02f, -0.01f)
                horizontalLineTo(13f)
                curveToRelative(-0.35f, -0.2f, -0.75f, -0.3f, -1.19f, -0.26f)
                curveTo(10.76f, 7.11f, 10f, 8.04f, 10f, 9.09f)
                verticalLineTo(15f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.45f)
                curveToRelative(1.29f, 1.07f, 3.25f, 1.94f, 5f, 1.95f)
                close()
                moveToRelative(-6.17f, 5f)
                curveToRelative(-0.41f, 1.16f, -1.52f, 2f, -2.83f, 2f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                curveToRelative(0f, -1.31f, 0.84f, -2.41f, 2f, -2.83f)
                verticalLineTo(12.1f)
                curveToRelative(-2.28f, 0.46f, -4f, 2.48f, -4f, 4.9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(2.42f, 0f, 4.44f, -1.72f, 4.9f, -4f)
                horizontalLineToRelative(-2.07f)
                close()
            }
        }.build()
        
        return _Accessible!!
    }

private var _Accessible: ImageVector? = null

