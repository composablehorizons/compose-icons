package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_speaker: ImageVector
    get() {
        if (_Mobile_speaker != null) return _Mobile_speaker!!
        
        _Mobile_speaker = ImageVector.Builder(
            name = "mobile_speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(187f)
                lineTo(427f, 480f)
                horizontalLineTo(280f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(147f)
                lineToRelative(80f, 80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(260f, -600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(420f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(380f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(340f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(380f, 280f)
                close()
                moveToRelative(220f, 580f)
                lineTo(460f, 720f)
                horizontalLineTo(360f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(100f)
                lineToRelative(140f, -140f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(80f, 57f)
                verticalLineToRelative(-80f)
                quadToRelative(70f, -15f, 115f, -70f)
                reflectiveQuadToRelative(45f, -127f)
                quadToRelative(0f, -72f, -45f, -127f)
                reflectiveQuadToRelative(-115f, -69f)
                verticalLineToRelative(-80f)
                quadToRelative(104f, 14f, 172f, 92.5f)
                reflectiveQuadTo(920f, 640f)
                quadToRelative(0f, 105f, -68f, 183.5f)
                reflectiveQuadTo(680f, 917f)
                close()
                moveToRelative(0f, -165f)
                verticalLineToRelative(-225f)
                quadToRelative(35f, 12f, 57.5f, 43f)
                reflectiveQuadToRelative(22.5f, 70f)
                quadToRelative(0f, 39f, -22.5f, 69.5f)
                reflectiveQuadTo(680f, 752f)
                close()
            }
        }.build()
        
        return _Mobile_speaker!!
    }

private var _Mobile_speaker: ImageVector? = null

