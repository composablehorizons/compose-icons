package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Fan_focus: ImageVector
    get() {
        if (_Fan_focus != null) return _Fan_focus!!
        
        _Fan_focus = ImageVector.Builder(
            name = "fan_focus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                lineTo(340f, 740f)
                lineToRelative(56f, -56f)
                lineToRelative(44f, 43f)
                verticalLineToRelative(-247f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(247f)
                lineToRelative(44f, -43f)
                lineToRelative(56f, 56f)
                lineTo(480f, 880f)
                close()
                moveTo(240f, 720f)
                lineTo(100f, 580f)
                lineToRelative(56f, -56f)
                lineToRelative(44f, 43f)
                verticalLineToRelative(-247f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(247f)
                lineToRelative(44f, -43f)
                lineToRelative(56f, 56f)
                lineToRelative(-140f, 140f)
                close()
                moveToRelative(480f, 0f)
                lineTo(580f, 580f)
                lineToRelative(56f, -56f)
                lineToRelative(44f, 43f)
                verticalLineToRelative(-247f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(247f)
                lineToRelative(44f, -43f)
                lineToRelative(56f, 56f)
                lineToRelative(-140f, 140f)
                close()
                moveTo(80f, 440f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Fan_focus!!
    }

private var _Fan_focus: ImageVector? = null

