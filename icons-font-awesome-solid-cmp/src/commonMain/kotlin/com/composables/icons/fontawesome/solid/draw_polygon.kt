package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.DrawPolygon: ImageVector
    get() {
        if (_DrawPolygon != null) return _DrawPolygon!!
        
        _DrawPolygon = ImageVector.Builder(
            name = "draw-polygon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 352f)
                curveToRelative(-0.35f, 0f, -0.67f, 0.1f, -1.02f, 0.1f)
                lineToRelative(-39.2f, -65.32f)
                curveToRelative(5.07f, -9.17f, 8.22f, -19.56f, 8.22f, -30.78f)
                reflectiveCurveToRelative(-3.14f, -21.61f, -8.22f, -30.78f)
                lineToRelative(39.2f, -65.32f)
                curveToRelative(0.35f, 0.01f, 0.67f, 0.1f, 1.02f, 0.1f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                reflectiveCurveToRelative(-28.65f, -64f, -64f, -64f)
                curveToRelative(-23.63f, 0f, -44.04f, 12.95f, -55.12f, 32f)
                horizontalLineTo(119.12f)
                curveTo(108.04f, 44.95f, 87.63f, 32f, 64f, 32f)
                curveTo(28.65f, 32f, 0f, 60.65f, 0f, 96f)
                curveToRelative(0f, 23.63f, 12.95f, 44.04f, 32f, 55.12f)
                verticalLineToRelative(209.75f)
                curveTo(12.95f, 371.96f, 0f, 392.37f, 0f, 416f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                curveToRelative(23.63f, 0f, 44.04f, -12.95f, 55.12f, -32f)
                horizontalLineToRelative(209.75f)
                curveToRelative(11.09f, 19.05f, 31.49f, 32f, 55.12f, 32f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                curveToRelative(0.01f, -35.35f, -28.64f, -64f, -63.99f, -64f)
                close()
                moveToRelative(-288f, 8.88f)
                verticalLineTo(151.12f)
                arcTo(63.825f, 63.825f, 0f, false, false, 119.12f, 128f)
                horizontalLineToRelative(208.36f)
                lineToRelative(-38.46f, 64.1f)
                curveToRelative(-0.35f, -0.01f, -0.67f, -0.1f, -1.02f, -0.1f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                reflectiveCurveToRelative(28.65f, 64f, 64f, 64f)
                curveToRelative(0.35f, 0f, 0.67f, -0.1f, 1.02f, -0.1f)
                lineToRelative(38.46f, 64.1f)
                horizontalLineTo(119.12f)
                arcTo(63.748f, 63.748f, 0f, false, false, 96f, 360.88f)
                close()
                moveTo(272f, 256f)
                curveToRelative(0f, -8.82f, 7.18f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.18f, 16f, 16f)
                reflectiveCurveToRelative(-7.18f, 16f, -16f, 16f)
                reflectiveCurveToRelative(-16f, -7.18f, -16f, -16f)
                close()
                moveTo(400f, 96f)
                curveToRelative(0f, 8.82f, -7.18f, 16f, -16f, 16f)
                reflectiveCurveToRelative(-16f, -7.18f, -16f, -16f)
                reflectiveCurveToRelative(7.18f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.18f, 16f, 16f)
                close()
                moveTo(64f, 80f)
                curveToRelative(8.82f, 0f, 16f, 7.18f, 16f, 16f)
                reflectiveCurveToRelative(-7.18f, 16f, -16f, 16f)
                reflectiveCurveToRelative(-16f, -7.18f, -16f, -16f)
                reflectiveCurveToRelative(7.18f, -16f, 16f, -16f)
                close()
                moveTo(48f, 416f)
                curveToRelative(0f, -8.82f, 7.18f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.18f, 16f, 16f)
                reflectiveCurveToRelative(-7.18f, 16f, -16f, 16f)
                reflectiveCurveToRelative(-16f, -7.18f, -16f, -16f)
                close()
                moveToRelative(336f, 16f)
                curveToRelative(-8.82f, 0f, -16f, -7.18f, -16f, -16f)
                reflectiveCurveToRelative(7.18f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.18f, 16f, 16f)
                reflectiveCurveToRelative(-7.18f, 16f, -16f, 16f)
                close()
            }
        }.build()
        
        return _DrawPolygon!!
    }

private var _DrawPolygon: ImageVector? = null

