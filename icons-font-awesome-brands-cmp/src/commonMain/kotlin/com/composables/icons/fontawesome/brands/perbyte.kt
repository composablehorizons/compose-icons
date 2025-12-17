package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Perbyte: ImageVector
    get() {
        if (_Perbyte != null) return _Perbyte!!
        
        _Perbyte = ImageVector.Builder(
            name = "perbyte",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(305.314f, 284.578f)
                horizontalLineTo(246.6f)
                verticalLineTo(383.3f)
                horizontalLineToRelative(58.711f)
                quadToRelative(24.423f, 0f, 38.193f, -13.77f)
                reflectiveQuadToRelative(13.77f, -36.11f)
                quadToRelative(0f, -21.826f, -14.032f, -35.335f)
                reflectiveQuadTo(305.314f, 284.578f)
                close()
                moveTo(149.435f, 128.7f)
                horizontalLineTo(90.724f)
                verticalLineToRelative(98.723f)
                horizontalLineToRelative(58.711f)
                quadToRelative(24.42f, 0f, 38.19f, -13.773f)
                reflectiveQuadToRelative(13.77f, -36.107f)
                quadToRelative(0f, -21.826f, -14.029f, -35.338f)
                reflectiveQuadTo(149.435f, 128.7f)
                close()
                moveTo(366.647f, 32f)
                horizontalLineTo(81.353f)
                arcTo(81.445f, 81.445f, 0f, false, false, 0f, 113.352f)
                verticalLineTo(398.647f)
                arcTo(81.445f, 81.445f, 0f, false, false, 81.353f, 480f)
                horizontalLineTo(366.647f)
                arcTo(81.445f, 81.445f, 0f, false, false, 448f, 398.647f)
                verticalLineTo(113.352f)
                arcTo(81.445f, 81.445f, 0f, false, false, 366.647f, 32f)
                close()
                moveToRelative(63.635f, 366.647f)
                arcToRelative(63.706f, 63.706f, 0f, false, true, -63.635f, 63.635f)
                horizontalLineTo(81.353f)
                arcToRelative(63.706f, 63.706f, 0f, false, true, -63.635f, -63.635f)
                verticalLineTo(113.352f)
                arcTo(63.706f, 63.706f, 0f, false, true, 81.353f, 49.718f)
                horizontalLineTo(366.647f)
                arcToRelative(63.706f, 63.706f, 0f, false, true, 63.635f, 63.634f)
                close()
                moveTo(305.314f, 128.7f)
                horizontalLineTo(246.6f)
                verticalLineToRelative(98.723f)
                horizontalLineToRelative(58.711f)
                quadToRelative(24.423f, 0f, 38.193f, -13.773f)
                reflectiveQuadToRelative(13.77f, -36.107f)
                quadToRelative(0f, -21.826f, -14.032f, -35.338f)
                reflectiveQuadTo(305.314f, 128.7f)
                close()
            }
        }.build()
        
        return _Perbyte!!
    }

private var _Perbyte: ImageVector? = null

