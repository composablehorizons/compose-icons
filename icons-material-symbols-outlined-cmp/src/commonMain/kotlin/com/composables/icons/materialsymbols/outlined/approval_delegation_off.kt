package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Approval_delegation_off: ImageVector
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
                moveTo(320f, 740f)
                lineToRelative(278f, 76f)
                lineToRelative(167f, -51f)
                lineToRelative(-45f, -45f)
                horizontalLineTo(598f)
                quadToRelative(-20f, 0f, -39f, -1.5f)
                reflectiveQuadToRelative(-37f, -8.5f)
                lineToRelative(-93f, -31f)
                lineToRelative(22f, -78f)
                lineToRelative(81f, 27f)
                quadToRelative(16f, 5f, 32.5f, 8.5f)
                reflectiveQuadTo(598f, 640f)
                horizontalLineToRelative(42f)
                lineToRelative(-39f, -39f)
                lineToRelative(-217f, -81f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(220f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(304f)
                quadToRelative(7f, 0f, 14f, 1.5f)
                reflectiveQuadToRelative(13f, 3.5f)
                lineToRelative(53f, 19f)
                lineToRelative(365f, 364f)
                lineToRelative(-229f, 72f)
                lineToRelative(-280f, -78f)
                verticalLineToRelative(58f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(718f, 78f)
                lineToRelative(-56f, 56f)
                lineTo(26f, 138f)
                lineToRelative(56f, -56f)
                lineTo(878f, 878f)
                close()
            }
        }.build()
        
        return _Approval_delegation_off!!
    }

private var _Approval_delegation_off: ImageVector? = null

