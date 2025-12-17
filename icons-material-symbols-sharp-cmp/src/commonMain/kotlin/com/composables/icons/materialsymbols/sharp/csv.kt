package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Csv: ImageVector
    get() {
        if (_Csv != null) return _Csv!!
        
        _Csv = ImageVector.Builder(
            name = "csv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(190f, 600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineTo(250f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(190f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(196f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-146f)
                horizontalLineTo(446f)
                verticalLineToRelative(-34f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(386f)
                verticalLineToRelative(144f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(36f)
                horizontalLineTo(386f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(264f, 0f)
                horizontalLineToRelative(60f)
                lineToRelative(70f, -240f)
                horizontalLineToRelative(-60f)
                lineToRelative(-40f, 138f)
                lineToRelative(-40f, -138f)
                horizontalLineToRelative(-60f)
                lineToRelative(70f, 240f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Csv!!
    }

private var _Csv: ImageVector? = null

