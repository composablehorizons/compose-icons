package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Frame_person: ImageVector
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
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 360f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 400f)
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
                moveToRelative(240f, -120f)
                quadToRelative(-41f, 0f, -80f, 10f)
                reflectiveQuadToRelative(-74f, 30f)
                horizontalLineToRelative(308f)
                quadToRelative(-35f, -20f, -74f, -30f)
                reflectiveQuadToRelative(-80f, -10f)
                close()
                moveToRelative(0f, -240f)
                close()
                moveToRelative(0f, 280f)
                horizontalLineToRelative(154f)
                horizontalLineToRelative(-308f)
                horizontalLineToRelative(154f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveTo(80f, 320f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(160f)
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
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(640f)
                close()
                moveToRelative(160f, -560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Frame_person!!
    }

private var _Frame_person: ImageVector? = null

