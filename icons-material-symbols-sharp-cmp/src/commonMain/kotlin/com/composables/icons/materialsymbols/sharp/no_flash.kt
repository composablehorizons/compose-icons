package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.No_flash: ImageVector
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
                moveTo(160f, 800f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-47f)
                lineTo(537f, 650f)
                quadToRelative(-11f, 48f, -48.5f, 79f)
                reflectiveQuadTo(400f, 760f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -51f, 31f, -88.5f)
                reflectiveQuadToRelative(79f, -48.5f)
                lineToRelative(-27f, -27f)
                horizontalLineTo(160f)
                verticalLineToRelative(344f)
                close()
                moveToRelative(240f, -120f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(460f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(400f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(340f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(400f, 680f)
                close()
                moveToRelative(320f, -75f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-69f)
                horizontalLineToRelative(-69f)
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
                moveToRelative(-120f, 85f)
                close()
                moveToRelative(-148f, 79f)
                close()
            }
        }.build()
        
        return _No_flash!!
    }

private var _No_flash: ImageVector? = null

