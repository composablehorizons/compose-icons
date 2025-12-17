package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PlaceOfWorship: ImageVector
    get() {
        if (_PlaceOfWorship != null) return _PlaceOfWorship!!
        
        _PlaceOfWorship = ImageVector.Builder(
            name = "place-of-worship",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620.61f, 366.55f)
                lineTo(512f, 320f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(112f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(395.96f)
                arcToRelative(32f, 32f, 0f, false, false, -19.39f, -29.41f)
                close()
                moveTo(0f, 395.96f)
                verticalLineTo(496f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(112f)
                verticalLineTo(320f)
                lineTo(19.39f, 366.55f)
                arcTo(32f, 32f, 0f, false, false, 0f, 395.96f)
                close()
                moveToRelative(464.46f, -149.28f)
                lineTo(416f, 217.6f)
                verticalLineTo(102.63f)
                curveToRelative(0f, -8.49f, -3.37f, -16.62f, -9.38f, -22.63f)
                lineTo(331.31f, 4.69f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.62f, 0f)
                lineTo(233.38f, 80f)
                curveToRelative(-6f, 6f, -9.38f, 14.14f, -9.38f, 22.63f)
                verticalLineTo(217.6f)
                lineToRelative(-48.46f, 29.08f)
                arcTo(31.997f, 31.997f, 0f, false, false, 160f, 274.12f)
                verticalLineTo(512f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -35.35f, 28.66f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.65f, 64f, 64f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(96f)
                verticalLineTo(274.12f)
                curveToRelative(0f, -11.24f, -5.9f, -21.66f, -15.54f, -27.44f)
                close()
            }
        }.build()
        
        return _PlaceOfWorship!!
    }

private var _PlaceOfWorship: ImageVector? = null

