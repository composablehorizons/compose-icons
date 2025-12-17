package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Approval_delegation: ImageVector
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
                moveToRelative(43f, 458f)
                lineToRelative(-280f, -78f)
                verticalLineToRelative(58f)
                horizontalLineTo(40f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(318f)
                lineToRelative(322f, 120f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                lineTo(560f, 900f)
                close()
                moveTo(120f, 800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(438f, 16f)
                lineToRelative(238f, -74f)
                verticalLineToRelative(-22f)
                horizontalLineTo(513f)
                lineToRelative(-125f, -42f)
                lineToRelative(24f, -76f)
                lineToRelative(117f, 38f)
                horizontalLineToRelative(71f)
                verticalLineToRelative(-26f)
                lineToRelative(-256f, -94f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(220f)
                lineToRelative(278f, 76f)
                close()
            }
        }.build()
        
        return _Approval_delegation!!
    }

private var _Approval_delegation: ImageVector? = null

