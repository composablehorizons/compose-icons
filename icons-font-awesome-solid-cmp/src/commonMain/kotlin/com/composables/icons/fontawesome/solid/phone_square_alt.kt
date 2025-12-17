package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PhoneSquareAlt: ImageVector
    get() {
        if (_PhoneSquareAlt != null) return _PhoneSquareAlt!!
        
        _PhoneSquareAlt = ImageVector.Builder(
            name = "phone-square-alt",
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
                arcTo(48f, 48f, 0f, false, false, 0f, 80f)
                verticalLineToRelative(352f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, 48f)
                horizontalLineToRelative(352f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, -48f)
                verticalLineTo(80f)
                arcToRelative(48f, 48f, 0f, false, false, -48f, -48f)
                close()
                moveToRelative(-16.39f, 307.37f)
                lineToRelative(-15f, 65f)
                arcTo(15f, 15f, 0f, false, true, 354f, 416f)
                curveTo(194f, 416f, 64f, 286.29f, 64f, 126f)
                arcToRelative(15.7f, 15.7f, 0f, false, true, 11.63f, -14.61f)
                lineToRelative(65f, -15f)
                arcTo(18.23f, 18.23f, 0f, false, true, 144f, 96f)
                arcToRelative(16.27f, 16.27f, 0f, false, true, 13.79f, 9.09f)
                lineToRelative(30f, 70f)
                arcTo(17.9f, 17.9f, 0f, false, true, 189f, 181f)
                arcToRelative(17f, 17f, 0f, false, true, -5.5f, 11.61f)
                lineToRelative(-37.89f, 31f)
                arcToRelative(231.91f, 231.91f, 0f, false, false, 110.78f, 110.78f)
                lineToRelative(31f, -37.89f)
                arcTo(17f, 17f, 0f, false, true, 299f, 291f)
                arcToRelative(17.85f, 17.85f, 0f, false, true, 5.91f, 1.21f)
                lineToRelative(70f, 30f)
                arcTo(16.25f, 16.25f, 0f, false, true, 384f, 336f)
                arcToRelative(17.41f, 17.41f, 0f, false, true, -0.39f, 3.37f)
                close()
            }
        }.build()
        
        return _PhoneSquareAlt!!
    }

private var _PhoneSquareAlt: ImageVector? = null

