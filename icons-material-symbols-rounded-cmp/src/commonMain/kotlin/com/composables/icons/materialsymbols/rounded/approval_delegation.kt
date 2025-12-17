package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Approval_delegation: ImageVector
    get() {
        if (_Approval_delegation != null) return _Approval_delegation!!
        
        _Approval_delegation = ImageVector.Builder(
            name = "approval_delegation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(517f, 329f)
                lineToRelative(199f, -198f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(772f, 131f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(545f, 414f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(375f, 300f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(12.5f, -28f)
                quadToRelative(12f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(85f, 85f)
                close()
                moveToRelative(41f, 487f)
                lineToRelative(238f, -74f)
                quadToRelative(-5f, -9f, -14.5f, -15.5f)
                reflectiveQuadTo(760f, 720f)
                horizontalLineTo(558f)
                quadToRelative(-27f, 0f, -43f, -2f)
                reflectiveQuadToRelative(-33f, -8f)
                lineToRelative(-57f, -19f)
                quadToRelative(-16f, -5f, -23f, -20f)
                reflectiveQuadToRelative(-2f, -31f)
                quadToRelative(5f, -16f, 19.5f, -23.5f)
                reflectiveQuadTo(450f, 614f)
                lineToRelative(42f, 14f)
                quadToRelative(17f, 5f, 38.5f, 8f)
                reflectiveQuadToRelative(58.5f, 4f)
                horizontalLineToRelative(11f)
                quadToRelative(0f, -11f, -6.5f, -21f)
                reflectiveQuadTo(578f, 606f)
                lineToRelative(-234f, -86f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(220f)
                lineToRelative(278f, 76f)
                close()
                moveToRelative(-21f, 78f)
                lineToRelative(-257f, -72f)
                quadToRelative(-8f, 26f, -31.5f, 42f)
                reflectiveQuadTo(200f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 800f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 440f)
                horizontalLineToRelative(224f)
                quadToRelative(7f, 0f, 14f, 1.5f)
                reflectiveQuadToRelative(13f, 3.5f)
                lineToRelative(235f, 87f)
                quadToRelative(33f, 12f, 53.5f, 42f)
                reflectiveQuadToRelative(20.5f, 66f)
                horizontalLineToRelative(80f)
                quadToRelative(50f, 0f, 85f, 33f)
                reflectiveQuadToRelative(35f, 87f)
                quadToRelative(0f, 22f, -11.5f, 34.5f)
                reflectiveQuadTo(833f, 815f)
                lineTo(583f, 893f)
                quadToRelative(-11f, 4f, -23f, 4f)
                reflectiveQuadToRelative(-23f, -3f)
                close()
                moveToRelative(-417f, -94f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Approval_delegation!!
    }

private var _Approval_delegation: ImageVector? = null

