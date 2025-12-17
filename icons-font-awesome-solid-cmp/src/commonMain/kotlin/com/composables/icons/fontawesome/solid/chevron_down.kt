package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChevronDown: ImageVector
    get() {
        if (_ChevronDown != null) return _ChevronDown!!
        
        _ChevronDown = ImageVector.Builder(
            name = "chevron-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(207.029f, 381.476f)
                lineTo(12.686f, 187.132f)
                curveToRelative(-9.373f, -9.373f, -9.373f, -24.569f, 0f, -33.941f)
                lineToRelative(22.667f, -22.667f)
                curveToRelative(9.357f, -9.357f, 24.522f, -9.375f, 33.901f, -0.04f)
                lineTo(224f, 284.505f)
                lineToRelative(154.745f, -154.021f)
                curveToRelative(9.379f, -9.335f, 24.544f, -9.317f, 33.901f, 0.04f)
                lineToRelative(22.667f, 22.667f)
                curveToRelative(9.373f, 9.373f, 9.373f, 24.569f, 0f, 33.941f)
                lineTo(240.971f, 381.476f)
                curveToRelative(-9.373f, 9.372f, -24.569f, 9.372f, -33.942f, 0f)
                close()
            }
        }.build()
        
        return _ChevronDown!!
    }

private var _ChevronDown: ImageVector? = null

