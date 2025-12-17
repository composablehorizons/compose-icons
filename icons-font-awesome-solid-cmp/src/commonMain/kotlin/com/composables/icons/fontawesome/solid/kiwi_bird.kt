package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.KiwiBird: ImageVector
    get() {
        if (_KiwiBird != null) return _KiwiBird!!
        
        _KiwiBird = ImageVector.Builder(
            name = "kiwi-bird",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(575.81f, 217.98f)
                curveTo(572.64f, 157.41f, 518.28f, 112f, 457.63f, 112f)
                horizontalLineToRelative(-9.37f)
                curveToRelative(-52.82f, 0f, -104.25f, -16.25f, -147.74f, -46.24f)
                curveToRelative(-41.99f, -28.96f, -96.04f, -41.62f, -153.21f, -28.7f)
                curveTo(129.3f, 41.12f, -0.08f, 78.24f, 0f, 224f)
                curveToRelative(0.04f, 70.95f, 38.68f, 132.8f, 95.99f, 166.01f)
                verticalLineTo(464f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(16f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-54.26f)
                curveToRelative(15.36f, 3.96f, 31.4f, 6.26f, 48f, 6.26f)
                curveToRelative(5.44f, 0f, 10.68f, -0.73f, 16f, -1.18f)
                verticalLineTo(464f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(16f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-59.43f)
                curveToRelative(14.24f, -5.06f, 27.88f, -11.39f, 40.34f, -19.51f)
                curveTo(342.07f, 355.25f, 393.86f, 336f, 448.46f, 336f)
                curveToRelative(25.48f, 0f, 16.01f, -0.31f, 23.05f, -0.78f)
                lineToRelative(74.41f, 136.44f)
                curveToRelative(2.86f, 5.23f, 8.3f, 8.34f, 14.05f, 8.34f)
                curveToRelative(1.31f, 0f, 2.64f, -0.16f, 3.95f, -0.5f)
                curveToRelative(7.09f, -1.8f, 12.05f, -8.19f, 12.05f, -15.5f)
                curveToRelative(0f, 0f, 0.14f, -240.24f, -0.16f, -246.02f)
                close()
                moveTo(463.97f, 248f)
                curveToRelative(-13.25f, 0f, -24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                close()
                moveToRelative(80f, 153.25f)
                lineToRelative(-39.86f, -73.08f)
                curveToRelative(15.12f, -5.83f, 28.73f, -14.6f, 39.86f, -25.98f)
                verticalLineToRelative(99.06f)
                close()
            }
        }.build()
        
        return _KiwiBird!!
    }

private var _KiwiBird: ImageVector? = null

