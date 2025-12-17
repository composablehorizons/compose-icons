package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Volume_down: ImageVector
    get() {
        if (_Volume_down != null) return _Volume_down!!
        
        _Volume_down = ImageVector.Builder(
            name = "volume_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(160f)
                lineToRelative(200f, -200f)
                verticalLineToRelative(640f)
                lineTo(360f, 600f)
                horizontalLineTo(200f)
                close()
                moveToRelative(440f, 40f)
                verticalLineToRelative(-322f)
                quadToRelative(45f, 21f, 72.5f, 65f)
                reflectiveQuadToRelative(27.5f, 97f)
                quadToRelative(0f, 53f, -27.5f, 96f)
                reflectiveQuadTo(640f, 640f)
                close()
                moveTo(480f, 354f)
                lineToRelative(-86f, 86f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(114f)
                lineToRelative(86f, 86f)
                verticalLineToRelative(-252f)
                close()
                moveTo(380f, 480f)
                close()
            }
        }.build()
        
        return _Volume_down!!
    }

private var _Volume_down: ImageVector? = null

