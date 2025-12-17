package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sort_by_alpha: ImageVector
    get() {
        if (_Sort_by_alpha != null) return _Sort_by_alpha!!
        
        _Sort_by_alpha = ImageVector.Builder(
            name = "sort_by_alpha",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 680f)
                lineToRelative(150f, -400f)
                horizontalLineToRelative(86f)
                lineToRelative(150f, 400f)
                horizontalLineToRelative(-82f)
                lineToRelative(-34f, -96f)
                horizontalLineTo(196f)
                lineToRelative(-32f, 96f)
                horizontalLineTo(80f)
                close()
                moveToRelative(140f, -164f)
                horizontalLineToRelative(104f)
                lineToRelative(-48f, -150f)
                horizontalLineToRelative(-6f)
                lineToRelative(-50f, 150f)
                close()
                moveToRelative(328f, 164f)
                verticalLineToRelative(-76f)
                lineToRelative(202f, -252f)
                horizontalLineTo(556f)
                verticalLineToRelative(-72f)
                horizontalLineToRelative(282f)
                verticalLineToRelative(76f)
                lineTo(638f, 608f)
                horizontalLineToRelative(202f)
                verticalLineToRelative(72f)
                horizontalLineTo(548f)
                close()
                moveTo(360f, 200f)
                lineToRelative(120f, -120f)
                lineToRelative(120f, 120f)
                horizontalLineTo(360f)
                close()
                moveTo(480f, 880f)
                lineTo(360f, 760f)
                horizontalLineToRelative(240f)
                lineTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Sort_by_alpha!!
    }

private var _Sort_by_alpha: ImageVector? = null

