package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Cell_merge: ImageVector
    get() {
        if (_Cell_merge != null) return _Cell_merge!!
        
        _Cell_merge = ImageVector.Builder(
            name = "cell_merge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(600f)
                close()
                moveTo(287f, 633f)
                lineToRelative(-57f, -56f)
                lineToRelative(57f, -57f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(207f)
                lineToRelative(-57f, -57f)
                lineToRelative(57f, -56f)
                lineToRelative(153f, 153f)
                lineToRelative(-153f, 153f)
                close()
                moveToRelative(386f, 0f)
                lineTo(520f, 480f)
                lineToRelative(153f, -153f)
                lineToRelative(57f, 56f)
                lineToRelative(-57f, 57f)
                horizontalLineToRelative(207f)
                verticalLineToRelative(80f)
                horizontalLineTo(673f)
                lineToRelative(57f, 57f)
                lineToRelative(-57f, 56f)
                close()
                moveTo(120f, 360f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Cell_merge!!
    }

private var _Cell_merge: ImageVector? = null

