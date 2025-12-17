package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Drum: ImageVector
    get() {
        if (_Drum != null) return _Drum!!
        
        _Drum = ImageVector.Builder(
            name = "drum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(431.34f, 122.05f)
                lineToRelative(73.53f, -47.42f)
                arcToRelative(16f, 16f, 0f, false, false, 4.44f, -22.19f)
                lineToRelative(-8.87f, -13.31f)
                arcToRelative(16f, 16f, 0f, false, false, -22.19f, -4.44f)
                lineToRelative(-110.06f, 71f)
                curveTo(318.43f, 96.91f, 271.22f, 96f, 256f, 96f)
                curveTo(219.55f, 96f, 0f, 100.55f, 0f, 208.15f)
                verticalLineToRelative(160.23f)
                curveToRelative(0f, 30.27f, 27.5f, 57.68f, 72f, 77.86f)
                verticalLineToRelative(-101.9f)
                arcToRelative(24f, 24f, 0f, true, true, 48f, 0f)
                verticalLineToRelative(118.93f)
                curveToRelative(33.05f, 9.11f, 71.07f, 15.06f, 112f, 16.73f)
                verticalLineTo(376.39f)
                arcToRelative(24f, 24f, 0f, true, true, 48f, 0f)
                verticalLineTo(480f)
                curveToRelative(40.93f, -1.67f, 78.95f, -7.62f, 112f, -16.73f)
                verticalLineTo(344.34f)
                arcToRelative(24f, 24f, 0f, true, true, 48f, 0f)
                verticalLineToRelative(101.9f)
                curveToRelative(44.5f, -20.18f, 72f, -47.59f, 72f, -77.86f)
                verticalLineTo(208.15f)
                curveToRelative(0f, -43.32f, -35.76f, -69.76f, -80.66f, -86.1f)
                close()
                moveTo(256f, 272.24f)
                curveToRelative(-114.88f, 0f, -208f, -28.69f, -208f, -64.09f)
                reflectiveCurveToRelative(93.12f, -64.08f, 208f, -64.08f)
                curveToRelative(17.15f, 0f, 33.73f, 0.71f, 49.68f, 1.91f)
                lineToRelative(-72.81f, 47f)
                arcToRelative(16f, 16f, 0f, false, false, -4.43f, 22.19f)
                lineToRelative(8.87f, 13.31f)
                arcToRelative(16f, 16f, 0f, false, false, 22.19f, 4.44f)
                lineToRelative(118.64f, -76.52f)
                curveTo(430.09f, 168f, 464f, 186.84f, 464f, 208.15f)
                curveToRelative(0f, 35.4f, -93.13f, 64.09f, -208f, 64.09f)
                close()
            }
        }.build()
        
        return _Drum!!
    }

private var _Drum: ImageVector? = null

