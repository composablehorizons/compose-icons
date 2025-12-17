package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PhoneSquare: ImageVector
    get() {
        if (_PhoneSquare != null) return _PhoneSquare!!
        
        _PhoneSquare = ImageVector.Builder(
            name = "phone-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.49f, 32f, 0f, 53.49f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveTo(94f, 416f)
                curveToRelative(-7.033f, 0f, -13.057f, -4.873f, -14.616f, -11.627f)
                lineToRelative(-14.998f, -65f)
                arcToRelative(15f, 15f, 0f, false, true, 8.707f, -17.16f)
                lineToRelative(69.998f, -29.999f)
                arcToRelative(15f, 15f, 0f, false, true, 17.518f, 4.289f)
                lineToRelative(30.997f, 37.885f)
                curveToRelative(48.944f, -22.963f, 88.297f, -62.858f, 110.781f, -110.78f)
                lineToRelative(-37.886f, -30.997f)
                arcToRelative(15.001f, 15.001f, 0f, false, true, -4.289f, -17.518f)
                lineToRelative(30f, -69.998f)
                arcToRelative(15f, 15f, 0f, false, true, 17.16f, -8.707f)
                lineToRelative(65f, 14.998f)
                arcTo(14.997f, 14.997f, 0f, false, true, 384f, 126f)
                curveToRelative(0f, 160.292f, -129.945f, 290f, -290f, 290f)
                close()
            }
        }.build()
        
        return _PhoneSquare!!
    }

private var _PhoneSquare: ImageVector? = null

