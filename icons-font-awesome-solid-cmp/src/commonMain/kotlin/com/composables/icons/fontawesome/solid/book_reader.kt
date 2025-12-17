package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BookReader: ImageVector
    get() {
        if (_BookReader != null) return _BookReader!!
        
        _BookReader = ImageVector.Builder(
            name = "book-reader",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(352f, 96f)
                curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
                reflectiveCurveToRelative(-96f, 42.98f, -96f, 96f)
                reflectiveCurveToRelative(42.98f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -42.98f, 96f, -96f)
                close()
                moveTo(233.59f, 241.1f)
                curveToRelative(-59.33f, -36.32f, -155.43f, -46.3f, -203.79f, -49.05f)
                curveTo(13.55f, 191.13f, 0f, 203.51f, 0f, 219.14f)
                verticalLineToRelative(222.8f)
                curveToRelative(0f, 14.33f, 11.59f, 26.28f, 26.49f, 27.05f)
                curveToRelative(43.66f, 2.29f, 131.99f, 10.68f, 193.04f, 41.43f)
                curveToRelative(9.37f, 4.72f, 20.48f, -1.71f, 20.48f, -11.87f)
                verticalLineTo(252.56f)
                curveToRelative(-0.01f, -4.67f, -2.32f, -8.95f, -6.42f, -11.46f)
                close()
                moveToRelative(248.61f, -49.05f)
                curveToRelative(-48.35f, 2.74f, -144.46f, 12.73f, -203.78f, 49.05f)
                curveToRelative(-4.1f, 2.51f, -6.41f, 6.96f, -6.41f, 11.63f)
                verticalLineToRelative(245.79f)
                curveToRelative(0f, 10.19f, 11.14f, 16.63f, 20.54f, 11.9f)
                curveToRelative(61.04f, -30.72f, 149.32f, -39.11f, 192.97f, -41.4f)
                curveToRelative(14.9f, -0.78f, 26.49f, -12.73f, 26.49f, -27.06f)
                verticalLineTo(219.14f)
                curveToRelative(-0.01f, -15.63f, -13.56f, -28.01f, -29.81f, -27.09f)
                close()
            }
        }.build()
        
        return _BookReader!!
    }

private var _BookReader: ImageVector? = null

