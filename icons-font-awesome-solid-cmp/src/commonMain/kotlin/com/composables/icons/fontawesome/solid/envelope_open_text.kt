package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.EnvelopeOpenText: ImageVector
    get() {
        if (_EnvelopeOpenText != null) return _EnvelopeOpenText!!
        
        _EnvelopeOpenText = ImageVector.Builder(
            name = "envelope-open-text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(176f, 216f)
                horizontalLineToRelative(160f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(176f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                close()
                moveToRelative(-16f, 80f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(160f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(176f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(16f)
                close()
                moveToRelative(96f, 121.13f)
                curveToRelative(-16.42f, 0f, -32.84f, -5.06f, -46.86f, -15.19f)
                lineTo(0f, 250.86f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(250.86f)
                lineTo(302.86f, 401.94f)
                curveToRelative(-14.02f, 10.12f, -30.44f, 15.19f, -46.86f, 15.19f)
                close()
                moveToRelative(237.61f, -254.18f)
                curveToRelative(-8.85f, -6.94f, -17.24f, -13.47f, -29.61f, -22.81f)
                verticalLineTo(96f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                horizontalLineToRelative(-77.55f)
                curveToRelative(-3.04f, -2.2f, -5.87f, -4.26f, -9.04f, -6.56f)
                curveTo(312.6f, 29.17f, 279.2f, -0.35f, 256f, 0f)
                curveToRelative(-23.2f, -0.35f, -56.59f, 29.17f, -73.41f, 41.44f)
                curveToRelative(-3.17f, 2.3f, -6f, 4.36f, -9.04f, 6.56f)
                horizontalLineTo(96f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(44.14f)
                curveToRelative(-12.37f, 9.33f, -20.76f, 15.87f, -29.61f, 22.81f)
                arcTo(47.995f, 47.995f, 0f, false, false, 0f, 200.72f)
                verticalLineToRelative(10.65f)
                lineToRelative(96f, 69.35f)
                verticalLineTo(96f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(184.72f)
                lineToRelative(96f, -69.35f)
                verticalLineToRelative(-10.65f)
                curveToRelative(0f, -14.74f, -6.78f, -28.67f, -18.39f, -37.77f)
                close()
            }
        }.build()
        
        return _EnvelopeOpenText!!
    }

private var _EnvelopeOpenText: ImageVector? = null

