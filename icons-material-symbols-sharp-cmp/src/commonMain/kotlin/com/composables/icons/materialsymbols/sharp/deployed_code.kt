package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Deployed_code: ImageVector
    get() {
        if (_Deployed_code != null) return _Deployed_code!!
        
        _Deployed_code = ImageVector.Builder(
            name = "deployed_code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 777f)
                verticalLineToRelative(-274f)
                lineTo(200f, 364f)
                verticalLineToRelative(274f)
                lineToRelative(240f, 139f)
                close()
                moveToRelative(80f, 0f)
                lineToRelative(240f, -139f)
                verticalLineToRelative(-274f)
                lineTo(520f, 503f)
                verticalLineToRelative(274f)
                close()
                moveToRelative(-40f, -343f)
                lineToRelative(237f, -137f)
                lineToRelative(-237f, -137f)
                lineToRelative(-237f, 137f)
                lineToRelative(237f, 137f)
                close()
                moveTo(120f, 685f)
                verticalLineToRelative(-410f)
                lineToRelative(360f, -207f)
                lineToRelative(360f, 207f)
                verticalLineToRelative(410f)
                lineTo(480f, 892f)
                lineTo(120f, 685f)
                close()
                moveToRelative(360f, -205f)
                close()
            }
        }.build()
        
        return _Deployed_code!!
    }

private var _Deployed_code: ImageVector? = null

