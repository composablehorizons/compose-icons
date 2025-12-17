package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Early_on: ImageVector
    get() {
        if (_Early_on != null) return _Early_on!!
        
        _Early_on = ImageVector.Builder(
            name = "early_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 840f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-30f, -280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineTo(960f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(165f, -333f)
                lineToRelative(-43f, -42f)
                lineToRelative(57f, -57f)
                lineToRelative(42f, 43f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(531f, 911f)
                lineToRelative(-42f, -42f)
                lineToRelative(57f, -57f)
                lineToRelative(42f, 42f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(309f, -161f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-400f, 0f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(829f, 911f)
                lineToRelative(-56f, -57f)
                lineToRelative(42f, -42f)
                lineToRelative(57f, 56f)
                lineToRelative(-43f, 43f)
                close()
                moveTo(545f, 628f)
                lineToRelative(-56f, -57f)
                lineToRelative(42f, -42f)
                lineToRelative(57f, 56f)
                lineToRelative(-43f, 43f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Early_on!!
    }

private var _Early_on: ImageVector? = null

