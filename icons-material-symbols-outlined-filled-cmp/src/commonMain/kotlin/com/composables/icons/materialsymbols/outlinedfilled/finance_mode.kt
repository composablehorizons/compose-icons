package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Finance_mode: ImageVector
    get() {
        if (_Finance_mode != null) return _Finance_mode!!
        
        _Finance_mode = ImageVector.Builder(
            name = "finance_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 546f)
                verticalLineToRelative(-306f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(306f)
                lineToRelative(-60f, -56f)
                lineToRelative(-60f, 56f)
                close()
                moveToRelative(200f, 60f)
                verticalLineToRelative(-526f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(406f)
                lineTo(520f, 606f)
                close()
                moveTo(120f, 744f)
                verticalLineToRelative(-344f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(224f)
                lineTo(120f, 744f)
                close()
                moveToRelative(0f, 98f)
                lineToRelative(258f, -258f)
                lineToRelative(142f, 122f)
                lineToRelative(224f, -224f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-64f)
                lineTo(524f, 814f)
                lineTo(382f, 692f)
                lineTo(232f, 842f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Finance_mode!!
    }

private var _Finance_mode: ImageVector? = null

