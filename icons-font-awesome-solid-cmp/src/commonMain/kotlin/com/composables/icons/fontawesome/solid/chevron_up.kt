package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChevronUp: ImageVector
    get() {
        if (_ChevronUp != null) return _ChevronUp!!
        
        _ChevronUp = ImageVector.Builder(
            name = "chevron-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240.971f, 130.524f)
                lineToRelative(194.343f, 194.343f)
                curveToRelative(9.373f, 9.373f, 9.373f, 24.569f, 0f, 33.941f)
                lineToRelative(-22.667f, 22.667f)
                curveToRelative(-9.357f, 9.357f, -24.522f, 9.375f, -33.901f, 0.04f)
                lineTo(224f, 227.495f)
                lineTo(69.255f, 381.516f)
                curveToRelative(-9.379f, 9.335f, -24.544f, 9.317f, -33.901f, -0.04f)
                lineToRelative(-22.667f, -22.667f)
                curveToRelative(-9.373f, -9.373f, -9.373f, -24.569f, 0f, -33.941f)
                lineTo(207.03f, 130.525f)
                curveToRelative(9.372f, -9.373f, 24.568f, -9.373f, 33.941f, -0.001f)
                close()
            }
        }.build()
        
        return _ChevronUp!!
    }

private var _ChevronUp: ImageVector? = null

