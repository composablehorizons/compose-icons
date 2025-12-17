package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Location_automation: ImageVector
    get() {
        if (_Location_automation != null) return _Location_automation!!
        
        _Location_automation = ImageVector.Builder(
            name = "location_automation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 19f)
                verticalLineTo(7f)
                lineToRelative(8f, -6f)
                lineToRelative(8f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineTo(8f)
                lineToRelative(-6f, -4.5f)
                lineTo(6f, 8f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(14.5f, 3f)
                lineToRelative(-1.4f, -3.1f)
                lineToRelative(-3.1f, -1.4f)
                lineToRelative(3.1f, -1.4f)
                lineToRelative(1.4f, -3.1f)
                lineToRelative(1.4f, 3.1f)
                lineToRelative(3.1f, 1.4f)
                lineToRelative(-3.1f, 1.4f)
                close()
            }
        }.build()
        
        return _Location_automation!!
    }

private var _Location_automation: ImageVector? = null

