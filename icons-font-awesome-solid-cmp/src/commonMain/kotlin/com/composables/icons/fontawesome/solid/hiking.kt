package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Hiking: ImageVector
    get() {
        if (_Hiking != null) return _Hiking!!
        
        _Hiking = ImageVector.Builder(
            name = "hiking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80.95f, 472.23f)
                curveToRelative(-4.28f, 17.16f, 6.14f, 34.53f, 23.28f, 38.81f)
                curveToRelative(2.61f, 0.66f, 5.22f, 0.95f, 7.8f, 0.95f)
                curveToRelative(14.33f, 0f, 27.37f, -9.7f, 31.02f, -24.23f)
                lineToRelative(25.24f, -100.97f)
                lineToRelative(-52.78f, -52.78f)
                lineToRelative(-34.56f, 138.22f)
                close()
                moveToRelative(14.89f, -196.12f)
                lineTo(137f, 117f)
                curveToRelative(2.19f, -8.42f, -3.14f, -16.95f, -11.92f, -19.06f)
                curveToRelative(-43.88f, -10.52f, -88.35f, 15.07f, -99.32f, 57.17f)
                lineTo(0.49f, 253.24f)
                curveToRelative(-2.19f, 8.42f, 3.14f, 16.95f, 11.92f, 19.06f)
                lineToRelative(63.56f, 15.25f)
                curveToRelative(8.79f, 2.1f, 17.68f, -3.02f, 19.87f, -11.44f)
                close()
                moveTo(368f, 160f)
                horizontalLineToRelative(-16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-34.75f)
                lineToRelative(-46.78f, -46.78f)
                curveTo(243.38f, 134.11f, 228.61f, 128f, 212.91f, 128f)
                curveToRelative(-27.02f, 0f, -50.47f, 18.3f, -57.03f, 44.52f)
                lineToRelative(-26.92f, 107.72f)
                arcToRelative(32.012f, 32.012f, 0f, false, false, 8.42f, 30.39f)
                lineTo(224f, 397.25f)
                verticalLineTo(480f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-82.75f)
                curveToRelative(0f, -17.09f, -6.66f, -33.16f, -18.75f, -45.25f)
                lineToRelative(-46.82f, -46.82f)
                curveToRelative(0.15f, -0.5f, 0.49f, -0.89f, 0.62f, -1.41f)
                lineToRelative(19.89f, -79.57f)
                lineToRelative(22.43f, 22.43f)
                curveToRelative(6f, 6f, 14.14f, 9.38f, 22.62f, 9.38f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(240f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(16f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(176f)
                curveToRelative(0.01f, -8.84f, -7.15f, -16f, -15.99f, -16f)
                close()
                moveTo(240f, 96f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                reflectiveCurveTo(266.51f, 0f, 240f, 0f)
                reflectiveCurveToRelative(-48f, 21.49f, -48f, 48f)
                reflectiveCurveToRelative(21.49f, 48f, 48f, 48f)
                close()
            }
        }.build()
        
        return _Hiking!!
    }

private var _Hiking: ImageVector? = null

