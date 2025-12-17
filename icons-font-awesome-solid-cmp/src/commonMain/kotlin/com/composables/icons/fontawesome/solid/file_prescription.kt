package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FilePrescription: ImageVector
    get() {
        if (_FilePrescription != null) return _FilePrescription!!
        
        _FilePrescription = ImageVector.Builder(
            name = "file-prescription",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 136f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                curveTo(10.7f, 0f, 0f, 10.7f, 0f, 24f)
                verticalLineToRelative(464f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(160f)
                horizontalLineTo(248f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                close()
                moveToRelative(68.53f, 179.48f)
                lineToRelative(11.31f, 11.31f)
                curveToRelative(6.25f, 6.25f, 6.25f, 16.38f, 0f, 22.63f)
                lineToRelative(-29.9f, 29.9f)
                lineTo(304f, 409.38f)
                curveToRelative(6.25f, 6.25f, 6.25f, 16.38f, 0f, 22.63f)
                lineToRelative(-11.31f, 11.31f)
                curveToRelative(-6.25f, 6.25f, -16.38f, 6.25f, -22.63f, 0f)
                lineTo(240f, 413.25f)
                lineToRelative(-30.06f, 30.06f)
                curveToRelative(-6.25f, 6.25f, -16.38f, 6.25f, -22.63f, 0f)
                lineTo(176f, 432f)
                curveToRelative(-6.25f, -6.25f, -6.25f, -16.38f, 0f, -22.63f)
                lineToRelative(30.06f, -30.06f)
                lineTo(146.74f, 320f)
                horizontalLineTo(128f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineTo(96f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineTo(208f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(80f)
                curveToRelative(35.35f, 0f, 64f, 28.65f, 64f, 64f)
                curveToRelative(0f, 24.22f, -13.62f, 45.05f, -33.46f, 55.92f)
                lineTo(240f, 345.38f)
                lineToRelative(29.9f, -29.9f)
                curveToRelative(6.25f, -6.25f, 16.38f, -6.25f, 22.63f, 0f)
                close()
                moveTo(176f, 272f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(48f)
                curveToRelative(8.82f, 0f, 16f, 7.18f, 16f, 16f)
                reflectiveCurveToRelative(-7.18f, 16f, -16f, 16f)
                close()
                moveToRelative(208f, -150.1f)
                verticalLineToRelative(6.1f)
                horizontalLineTo(256f)
                verticalLineTo(0f)
                horizontalLineToRelative(6.1f)
                curveToRelative(6.4f, 0f, 12.5f, 2.5f, 17f, 7f)
                lineToRelative(97.9f, 98f)
                curveToRelative(4.5f, 4.5f, 7f, 10.6f, 7f, 16.9f)
                close()
            }
        }.build()
        
        return _FilePrescription!!
    }

private var _FilePrescription: ImageVector? = null

