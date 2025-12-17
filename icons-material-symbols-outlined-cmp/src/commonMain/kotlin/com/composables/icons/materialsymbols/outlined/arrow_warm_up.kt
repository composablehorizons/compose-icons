package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Arrow_warm_up: ImageVector
    get() {
        if (_Arrow_warm_up != null) return _Arrow_warm_up!!
        
        _Arrow_warm_up = ImageVector.Builder(
            name = "arrow_warm_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 233f)
                lineTo(256f, 416f)
                lineToRelative(-56f, -56f)
                lineToRelative(280f, -280f)
                lineToRelative(280f, 280f)
                lineToRelative(-56f, 57f)
                lineToRelative(-184f, -184f)
                verticalLineToRelative(287f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-287f)
                close()
                moveToRelative(0f, 487f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Arrow_warm_up!!
    }

private var _Arrow_warm_up: ImageVector? = null

