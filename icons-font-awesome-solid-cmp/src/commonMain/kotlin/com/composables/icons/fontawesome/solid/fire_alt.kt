package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FireAlt: ImageVector
    get() {
        if (_FireAlt != null) return _FireAlt!!
        
        _FireAlt = ImageVector.Builder(
            name = "fire-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(323.56f, 51.2f)
                curveToRelative(-20.8f, 19.3f, -39.58f, 39.59f, -56.22f, 59.97f)
                curveTo(240.08f, 73.62f, 206.28f, 35.53f, 168f, 0f)
                curveTo(69.74f, 91.17f, 0f, 209.96f, 0f, 281.6f)
                curveTo(0f, 408.85f, 100.29f, 512f, 224f, 512f)
                reflectiveCurveToRelative(224f, -103.15f, 224f, -230.4f)
                curveToRelative(0f, -53.27f, -51.98f, -163.14f, -124.44f, -230.4f)
                close()
                moveToRelative(-19.47f, 340.65f)
                curveTo(282.43f, 407.01f, 255.72f, 416f, 226.86f, 416f)
                curveTo(154.71f, 416f, 96f, 368.26f, 96f, 290.75f)
                curveToRelative(0f, -38.61f, 24.31f, -72.63f, 72.79f, -130.75f)
                curveToRelative(6.93f, 7.98f, 98.83f, 125.34f, 98.83f, 125.34f)
                lineToRelative(58.63f, -66.88f)
                curveToRelative(4.14f, 6.85f, 7.91f, 13.55f, 11.27f, 19.97f)
                curveToRelative(27.35f, 52.19f, 15.81f, 118.97f, -33.43f, 153.42f)
                close()
            }
        }.build()
        
        return _FireAlt!!
    }

private var _FireAlt: ImageVector? = null

