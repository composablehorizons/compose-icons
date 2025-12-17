package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Stack_off: ImageVector
    get() {
        if (_Stack_off != null) return _Stack_off!!
        
        _Stack_off = ImageVector.Builder(
            name = "stack_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 766f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-286f)
                horizontalLineTo(514f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(366f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(366f)
                close()
                moveTo(560f, 240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(274f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(366f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(97f, 303f)
                close()
                moveTo(400f, 800f)
                horizontalLineToRelative(286f)
                lineTo(400f, 514f)
                verticalLineToRelative(286f)
                close()
                moveTo(823f, 937f)
                lineToRelative(-57f, -57f)
                horizontalLineTo(400f)
                quadToRelative(-34f, 0f, -57f, -23f)
                reflectiveQuadToRelative(-23f, -57f)
                verticalLineToRelative(-366f)
                lineTo(160f, 274f)
                verticalLineToRelative(286f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-34f, 0f, -57f, -23f)
                reflectiveQuadToRelative(-23f, -57f)
                verticalLineToRelative(-366f)
                lineToRelative(-57f, -57f)
                lineToRelative(57f, -57f)
                lineTo(880f, 880f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(543f, 657f)
                close()
            }
        }.build()
        
        return _Stack_off!!
    }

private var _Stack_off: ImageVector? = null

