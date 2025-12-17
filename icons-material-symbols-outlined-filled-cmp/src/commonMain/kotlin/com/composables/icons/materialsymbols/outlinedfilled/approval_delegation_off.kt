package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Approval_delegation_off: ImageVector
    get() {
        if (_Approval_delegation_off != null) return _Approval_delegation_off!!
        
        _Approval_delegation_off = ImageVector.Builder(
            name = "approval_delegation_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(557f, 442f)
                lineTo(387f, 272f)
                lineToRelative(57f, -56f)
                lineToRelative(113f, 113f)
                lineToRelative(227f, -226f)
                lineToRelative(56f, 56f)
                lineToRelative(-283f, 283f)
                close()
                moveTo(878f, 878f)
                lineToRelative(-56f, 56f)
                lineTo(26f, 138f)
                lineToRelative(56f, -56f)
                lineTo(878f, 878f)
                close()
                moveToRelative(-558f, -77f)
                verticalLineToRelative(-361f)
                horizontalLineToRelative(64f)
                quadToRelative(7f, 0f, 14f, 1.5f)
                reflectiveQuadToRelative(14f, 3.5f)
                lineToRelative(51f, 18f)
                lineToRelative(177f, 177f)
                horizontalLineToRelative(-73f)
                quadToRelative(-5f, 0f, -7.5f, -0.5f)
                reflectiveQuadTo(553f, 637f)
                lineToRelative(-64f, -25f)
                lineToRelative(-13f, 39f)
                lineToRelative(77f, 27f)
                quadToRelative(2f, 1f, 6f, 1.5f)
                reflectiveQuadToRelative(7f, 0.5f)
                horizontalLineToRelative(114f)
                lineToRelative(123f, 123f)
                lineToRelative(-202f, 77f)
                lineToRelative(-281f, -79f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(440f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Approval_delegation_off!!
    }

private var _Approval_delegation_off: ImageVector? = null

