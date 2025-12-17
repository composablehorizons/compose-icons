package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Approval_delegation: ImageVector
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
                moveTo(517f, 442f)
                lineTo(347f, 272f)
                lineToRelative(57f, -56f)
                lineToRelative(113f, 113f)
                lineToRelative(227f, -226f)
                lineToRelative(56f, 56f)
                lineToRelative(-283f, 283f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(440f)
                horizontalLineTo(40f)
                close()
                moveToRelative(520f, 0f)
                lineToRelative(-280f, -79f)
                verticalLineToRelative(-361f)
                horizontalLineToRelative(79f)
                lineToRelative(321f, 120f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                lineToRelative(-70f, -27f)
                lineToRelative(-14f, 37f)
                lineToRelative(84f, 30f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                lineTo(560f, 880f)
                close()
            }
        }.build()
        
        return _Approval_delegation!!
    }

private var _Approval_delegation: ImageVector? = null

