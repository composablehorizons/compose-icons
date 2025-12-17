package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Whatshot: ImageVector
    get() {
        if (_Whatshot != null) return _Whatshot!!
        
        _Whatshot = ImageVector.Builder(
            name = "whatshot",
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
                moveTo(11.57f, 13.16f)
                curveToRelative(-1.36f, 0.28f, -2.17f, 1.16f, -2.17f, 2.41f)
                curveToRelative(0f, 1.34f, 1.11f, 2.42f, 2.49f, 2.42f)
                curveToRelative(2.05f, 0f, 3.71f, -1.66f, 3.71f, -3.71f)
                curveToRelative(0f, -1.07f, -0.15f, -2.12f, -0.46f, -3.12f)
                curveToRelative(-0.79f, 1.07f, -2.2f, 1.72f, -3.57f, 2f)
                close()
                moveTo(13.5f, 0.67f)
                reflectiveCurveToRelative(0.74f, 2.65f, 0.74f, 4.8f)
                curveToRelative(0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f)
                curveToRelative(-2.07f, 0f, -3.63f, -1.67f, -3.63f, -3.73f)
                lineToRelative(0.03f, -0.36f)
                curveTo(5.21f, 7.51f, 4f, 10.62f, 4f, 14f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.58f, 8f, -8f)
                curveTo(20f, 8.61f, 17.41f, 3.8f, 13.5f, 0.67f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -1.53f, 0.3f, -3.04f, 0.86f, -4.43f)
                curveToRelative(1.01f, 1.01f, 2.41f, 1.63f, 3.97f, 1.63f)
                curveToRelative(2.66f, 0f, 4.75f, -1.83f, 5.28f, -4.43f)
                curveTo(17.34f, 8.97f, 18f, 11.44f, 18f, 14f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                close()
            }
        }.build()
        
        return _Whatshot!!
    }

private var _Whatshot: ImageVector? = null

