package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChevronRight: ImageVector
    get() {
        if (_ChevronRight != null) return _ChevronRight!!
        
        _ChevronRight = ImageVector.Builder(
            name = "chevron-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(285.476f, 272.971f)
                lineTo(91.132f, 467.314f)
                curveToRelative(-9.373f, 9.373f, -24.569f, 9.373f, -33.941f, 0f)
                lineToRelative(-22.667f, -22.667f)
                curveToRelative(-9.357f, -9.357f, -9.375f, -24.522f, -0.04f, -33.901f)
                lineTo(188.505f, 256f)
                lineTo(34.484f, 101.255f)
                curveToRelative(-9.335f, -9.379f, -9.317f, -24.544f, 0.04f, -33.901f)
                lineToRelative(22.667f, -22.667f)
                curveToRelative(9.373f, -9.373f, 24.569f, -9.373f, 33.941f, 0f)
                lineTo(285.475f, 239.03f)
                curveToRelative(9.373f, 9.372f, 9.373f, 24.568f, 0.001f, 33.941f)
                close()
            }
        }.build()
        
        return _ChevronRight!!
    }

private var _ChevronRight: ImageVector? = null

