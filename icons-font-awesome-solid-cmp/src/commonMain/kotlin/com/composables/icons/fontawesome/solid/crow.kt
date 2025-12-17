package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Crow: ImageVector
    get() {
        if (_Crow != null) return _Crow!!
        
        _Crow = ImageVector.Builder(
            name = "crow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(544f, 32f)
                horizontalLineToRelative(-16.36f)
                curveTo(513.04f, 12.68f, 490.09f, 0f, 464f, 0f)
                curveToRelative(-44.18f, 0f, -80f, 35.82f, -80f, 80f)
                verticalLineToRelative(20.98f)
                lineTo(12.09f, 393.57f)
                arcTo(30.216f, 30.216f, 0f, false, false, 0f, 417.74f)
                curveToRelative(0f, 22.46f, 23.64f, 37.07f, 43.73f, 27.03f)
                lineTo(165.27f, 384f)
                horizontalLineToRelative(96.49f)
                lineToRelative(44.41f, 120.1f)
                curveToRelative(2.27f, 6.23f, 9.15f, 9.44f, 15.38f, 7.17f)
                lineToRelative(22.55f, -8.21f)
                curveToRelative(6.23f, -2.27f, 9.44f, -9.15f, 7.17f, -15.38f)
                lineTo(312.94f, 384f)
                horizontalLineTo(352f)
                curveToRelative(1.91f, 0f, 3.76f, -0.23f, 5.66f, -0.29f)
                lineToRelative(44.51f, 120.38f)
                curveToRelative(2.27f, 6.23f, 9.15f, 9.44f, 15.38f, 7.17f)
                lineToRelative(22.55f, -8.21f)
                curveToRelative(6.23f, -2.27f, 9.44f, -9.15f, 7.17f, -15.38f)
                lineToRelative(-41.24f, -111.53f)
                curveTo(485.74f, 352.8f, 544f, 279.26f, 544f, 192f)
                verticalLineToRelative(-80f)
                lineToRelative(96f, -16f)
                curveToRelative(0f, -35.35f, -42.98f, -64f, -96f, -64f)
                close()
                moveToRelative(-80f, 72f)
                curveToRelative(-13.25f, 0f, -24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                close()
            }
        }.build()
        
        return _Crow!!
    }

private var _Crow: ImageVector? = null

