package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Approval_delegation: ImageVector
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
                moveTo(535f, 873f)
                lineToRelative(-255f, -72f)
                verticalLineToRelative(-361f)
                horizontalLineToRelative(64f)
                quadToRelative(7f, 0f, 14f, 1.5f)
                reflectiveQuadToRelative(14f, 3.5f)
                lineToRelative(277f, 103f)
                quadToRelative(14f, 5f, 22.5f, 18f)
                reflectiveQuadToRelative(8.5f, 27f)
                quadToRelative(0f, 21f, -14.5f, 34f)
                reflectiveQuadTo(632f, 640f)
                horizontalLineTo(527f)
                quadToRelative(-5f, 0f, -7.5f, -0.5f)
                reflectiveQuadTo(513f, 637f)
                lineToRelative(-45f, -17f)
                quadToRelative(-8f, -3f, -16f, 1f)
                reflectiveQuadToRelative(-10f, 11f)
                quadToRelative(-2f, 8f, 1f, 15f)
                reflectiveQuadToRelative(11f, 10f)
                lineToRelative(59f, 21f)
                quadToRelative(2f, 1f, 6f, 1.5f)
                reflectiveQuadToRelative(7f, 0.5f)
                horizontalLineToRelative(274f)
                quadToRelative(32f, 0f, 56f, 23f)
                reflectiveQuadToRelative(24f, 57f)
                lineTo(585f, 871f)
                quadToRelative(-10f, 4f, -24.5f, 4.5f)
                reflectiveQuadTo(535f, 873f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(200f, 520f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(120f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 800f)
                close()
                moveToRelative(477f, -471f)
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
            }
        }.build()
        
        return _Approval_delegation!!
    }

private var _Approval_delegation: ImageVector? = null

