package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Contract_edit: ImageVector
    get() {
        if (_Contract_edit != null) return _Contract_edit!!
        
        _Contract_edit = ImageVector.Builder(
            name = "contract_edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                horizontalLineTo(240f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(280f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(-280f)
                horizontalLineTo(320f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(240f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(-123f)
                lineToRelative(263f, -262f)
                lineToRelative(122f, 123f)
                lineTo(683f, 880f)
                horizontalLineTo(560f)
                close()
                moveTo(360f, 480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(463f, 296f)
                lineToRelative(37f, -39f)
                lineToRelative(-37f, -37f)
                lineToRelative(-38f, 38f)
                lineToRelative(38f, 38f)
                close()
            }
        }.build()
        
        return _Contract_edit!!
    }

private var _Contract_edit: ImageVector? = null

