package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.No_flash: ImageVector
    get() {
        if (_No_flash != null) return _No_flash!!
        
        _No_flash = ImageVector.Builder(
            name = "no_flash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineTo(719f, 832f)
                verticalLineToRelative(48f)
                horizontalLineTo(80f)
                verticalLineToRelative(-504f)
                horizontalLineToRelative(166f)
                lineToRelative(8f, -9f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(370f, 483f)
                quadToRelative(-57f, 12f, -93.5f, 55f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                quadToRelative(59f, 0f, 103f, -37f)
                reflectiveQuadToRelative(55f, -93f)
                lineToRelative(-0.5f, 1f)
                lineToRelative(0.5f, -1f)
                lineToRelative(-188f, -187f)
                close()
                moveToRelative(30f, 237f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(400f, 720f)
                close()
                moveToRelative(320f, -115f)
                lineTo(435f, 320f)
                horizontalLineToRelative(68f)
                lineToRelative(51f, 56f)
                horizontalLineToRelative(166f)
                verticalLineToRelative(229f)
                close()
                moveToRelative(40f, -165f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(160f)
                lineToRelative(-64f, 144f)
                horizontalLineToRelative(64f)
                lineTo(760f, 440f)
                close()
            }
        }.build()
        
        return _No_flash!!
    }

private var _No_flash: ImageVector? = null

