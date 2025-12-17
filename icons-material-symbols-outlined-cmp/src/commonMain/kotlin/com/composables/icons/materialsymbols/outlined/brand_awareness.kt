package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Brand_awareness: ImageVector
    get() {
        if (_Brand_awareness != null) return _Brand_awareness!!
        
        _Brand_awareness = ImageVector.Builder(
            name = "brand_awareness",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(640f)
                close()
                moveToRelative(48f, 280f)
                lineToRelative(-128f, -96f)
                lineToRelative(48f, -64f)
                lineToRelative(128f, 96f)
                lineToRelative(-48f, 64f)
                close()
                moveToRelative(-80f, -480f)
                lineToRelative(-48f, -64f)
                lineToRelative(128f, -96f)
                lineToRelative(48f, 64f)
                lineToRelative(-128f, 96f)
                close()
                moveTo(120f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(160f)
                lineToRelative(200f, -200f)
                verticalLineToRelative(640f)
                lineTo(280f, 600f)
                horizontalLineTo(120f)
                close()
                moveToRelative(280f, -246f)
                lineToRelative(-86f, 86f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(114f)
                lineToRelative(86f, 86f)
                verticalLineToRelative(-252f)
                close()
                moveTo(300f, 480f)
                close()
            }
        }.build()
        
        return _Brand_awareness!!
    }

private var _Brand_awareness: ImageVector? = null

