package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Stamp: ImageVector
    get() {
        if (_Stamp != null) return _Stamp!!
        
        _Stamp = ImageVector.Builder(
            name = "stamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(32f, 512f)
                horizontalLineToRelative(448f)
                verticalLineToRelative(-64f)
                horizontalLineTo(32f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(384f, -256f)
                horizontalLineToRelative(-66.56f)
                curveToRelative(-16.26f, 0f, -29.44f, -13.18f, -29.44f, -29.44f)
                verticalLineToRelative(-9.46f)
                curveToRelative(0f, -27.37f, 8.88f, -53.41f, 21.46f, -77.72f)
                curveToRelative(9.11f, -17.61f, 12.9f, -38.39f, 9.05f, -60.42f)
                curveToRelative(-6.77f, -38.78f, -38.47f, -70.7f, -77.26f, -77.45f)
                curveTo(212.62f, -9.04f, 160f, 37.33f, 160f, 96f)
                curveToRelative(0f, 14.16f, 3.12f, 27.54f, 8.69f, 39.58f)
                curveTo(182.02f, 164.43f, 192f, 194.7f, 192f, 226.49f)
                verticalLineToRelative(0.07f)
                curveToRelative(0f, 16.26f, -13.18f, 29.44f, -29.44f, 29.44f)
                horizontalLineTo(96f)
                curveToRelative(-53.02f, 0f, -96f, 42.98f, -96f, 96f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(448f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
                close()
            }
        }.build()
        
        return _Stamp!!
    }

private var _Stamp: ImageVector? = null

