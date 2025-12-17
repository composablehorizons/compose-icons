package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Approval_delegation: ImageVector
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
                moveTo(280f, 801f)
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
                lineToRelative(-64f, -25f)
                lineToRelative(-13f, 39f)
                lineToRelative(77f, 27f)
                quadToRelative(2f, 1f, 6f, 1.5f)
                reflectiveQuadToRelative(7f, 0.5f)
                horizontalLineToRelative(274f)
                quadToRelative(32f, 0f, 56f, 23f)
                reflectiveQuadToRelative(24f, 57f)
                lineTo(561f, 880f)
                lineToRelative(-281f, -79f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(440f)
                horizontalLineTo(40f)
                close()
                moveToRelative(477f, -438f)
                lineTo(347f, 272f)
                lineToRelative(57f, -56f)
                lineToRelative(113f, 113f)
                lineToRelative(227f, -226f)
                lineToRelative(56f, 56f)
                lineToRelative(-283f, 283f)
                close()
            }
        }.build()
        
        return _Approval_delegation!!
    }

private var _Approval_delegation: ImageVector? = null

