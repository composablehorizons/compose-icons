package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Deployed_code: ImageVector
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
                moveTo(480f, 892f)
                lineTo(120f, 685f)
                verticalLineToRelative(-410f)
                lineToRelative(360f, -207f)
                lineToRelative(360f, 207f)
                verticalLineToRelative(410f)
                lineTo(480f, 892f)
                close()
                moveToRelative(-40f, -389f)
                verticalLineToRelative(274f)
                lineToRelative(40f, 23f)
                lineToRelative(40f, -23f)
                verticalLineToRelative(-274f)
                lineToRelative(240f, -139f)
                verticalLineToRelative(-42f)
                lineToRelative(-43f, -25f)
                lineToRelative(-237f, 137f)
                lineToRelative(-237f, -137f)
                lineToRelative(-43f, 25f)
                verticalLineToRelative(42f)
                lineToRelative(240f, 139f)
                close()
            }
        }.build()
        
        return _Deployed_code!!
    }

private var _Deployed_code: ImageVector? = null

