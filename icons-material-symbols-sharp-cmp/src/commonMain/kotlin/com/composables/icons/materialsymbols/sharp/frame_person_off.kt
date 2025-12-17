package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Frame_person_off: ImageVector
    get() {
        if (_Frame_person_off != null) return _Frame_person_off!!
        
        _Frame_person_off = ImageVector.Builder(
            name = "frame_person_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(818f, 932f)
                lineToRelative(-52f, -52f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(46f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-76f)
                quadToRelative(0f, -21f, 10.5f, -39.5f)
                reflectiveQuadTo(279f, 575f)
                quadToRelative(31f, -18f, 64.5f, -30.5f)
                reflectiveQuadTo(412f, 526f)
                lineTo(160f, 274f)
                verticalLineToRelative(46f)
                horizontalLineTo(80f)
                verticalLineToRelative(-126f)
                lineToRelative(-54f, -54f)
                lineToRelative(57f, -57f)
                lineTo(875f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(526f, 640f)
                lineToRelative(-40f, -40f)
                quadToRelative(-45f, 0f, -85f, 10f)
                reflectiveQuadToRelative(-75f, 30f)
                horizontalLineToRelative(200f)
                close()
                moveToRelative(74f, -280f)
                quadToRelative(0f, 26f, -10.5f, 48.5f)
                reflectiveQuadTo(562f, 448f)
                lineToRelative(-57f, -57f)
                quadToRelative(7f, -5f, 11f, -13f)
                reflectiveQuadToRelative(4f, -18f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-10f, 0f, -18f, 4f)
                reflectiveQuadToRelative(-13f, 11f)
                lineToRelative(-57f, -57f)
                quadToRelative(17f, -17f, 39.5f, -27.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                close()
                moveToRelative(280f, 280f)
                verticalLineToRelative(126f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(80f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(720f, -560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-323f, 43f)
                close()
                moveToRelative(9f, 277f)
                close()
                moveTo(320f, 80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-46f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(126f)
                close()
            }
        }.build()
        
        return _Frame_person_off!!
    }

private var _Frame_person_off: ImageVector? = null

