package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Dual_screen: ImageVector
    get() {
        if (_Dual_screen != null) return _Dual_screen!!
        
        _Dual_screen = ImageVector.Builder(
            name = "dual_screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 758f)
                verticalLineToRelative(-678f)
                lineToRelative(400f, 161f)
                verticalLineToRelative(677f)
                lineTo(160f, 758f)
                close()
                moveToRelative(480f, 2f)
                verticalLineToRelative(-574f)
                lineTo(378f, 80f)
                horizontalLineToRelative(422f)
                verticalLineToRelative(680f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Dual_screen!!
    }

private var _Dual_screen: ImageVector? = null

