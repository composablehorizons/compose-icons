package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Frame_person: ImageVector
    get() {
        if (_Frame_person != null) return _Frame_person!!
        
        _Frame_person = ImageVector.Builder(
            name = "frame_person",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
                moveTo(640f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(640f)
                close()
                moveToRelative(160f, -560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(480f, 480f)
                quadToRelative(-51f, 0f, -85.5f, -34.5f)
                reflectiveQuadTo(360f, 360f)
                quadToRelative(0f, -50f, 34.5f, -85f)
                reflectiveQuadToRelative(85.5f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 51f, -35f, 85.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveTo(240f, 720f)
                verticalLineToRelative(-76f)
                quadToRelative(0f, -21f, 10.5f, -39.5f)
                reflectiveQuadTo(279f, 575f)
                quadToRelative(46f, -27f, 96.5f, -41f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(54f, 0f, 104.5f, 14f)
                reflectiveQuadToRelative(96.5f, 41f)
                quadToRelative(18f, 11f, 28.5f, 29.5f)
                reflectiveQuadTo(720f, 644f)
                verticalLineToRelative(76f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Frame_person!!
    }

private var _Frame_person: ImageVector? = null

