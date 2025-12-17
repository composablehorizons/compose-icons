package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Performance_max: ImageVector
    get() {
        if (_Performance_max != null) return _Performance_max!!
        
        _Performance_max = ImageVector.Builder(
            name = "performance_max",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(466f, -120f)
                lineToRelative(214f, -214f)
                lineToRelative(-56f, -57f)
                lineToRelative(-158f, 158f)
                lineToRelative(-146f, -146f)
                lineToRelative(-200f, 200f)
                lineToRelative(56f, 57f)
                lineToRelative(144f, -144f)
                lineToRelative(146f, 146f)
                close()
                moveToRelative(4f, -220f)
                lineToRelative(28f, -62f)
                lineToRelative(62f, -28f)
                lineToRelative(-62f, -28f)
                lineToRelative(-28f, -62f)
                lineToRelative(-28f, 62f)
                lineToRelative(-62f, 28f)
                lineToRelative(62f, 28f)
                lineToRelative(28f, 62f)
                close()
            }
        }.build()
        
        return _Performance_max!!
    }

private var _Performance_max: ImageVector? = null

