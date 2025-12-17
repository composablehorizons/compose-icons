package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CheckBadge: ImageVector
    get() {
        if (_CheckBadge != null) return _CheckBadge!!
        
        _CheckBadge = ImageVector.Builder(
            name = "check-badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                curveToRelative(0f, 0.982f, -0.472f, 1.854f, -1.202f, 2.402f)
                arcToRelative(2.995f, 2.995f, 0f, false, true, -0.848f, 2.547f)
                arcToRelative(2.995f, 2.995f, 0f, false, true, -2.548f, 0.849f)
                arcTo(2.996f, 2.996f, 0f, false, true, 8f, 15f)
                arcToRelative(2.996f, 2.996f, 0f, false, true, -2.402f, -1.202f)
                arcToRelative(2.995f, 2.995f, 0f, false, true, -2.547f, -0.848f)
                arcToRelative(2.995f, 2.995f, 0f, false, true, -0.849f, -2.548f)
                arcTo(2.996f, 2.996f, 0f, false, true, 1f, 8f)
                curveToRelative(0f, -0.982f, 0.472f, -1.854f, 1.202f, -2.402f)
                arcToRelative(2.995f, 2.995f, 0f, false, true, 0.848f, -2.547f)
                arcToRelative(2.995f, 2.995f, 0f, false, true, 2.548f, -0.849f)
                arcTo(2.995f, 2.995f, 0f, false, true, 8f, 1f)
                curveToRelative(0.982f, 0f, 1.854f, 0.472f, 2.402f, 1.202f)
                arcToRelative(2.995f, 2.995f, 0f, false, true, 2.547f, 0.848f)
                curveToRelative(0.695f, 0.695f, 0.978f, 1.645f, 0.849f, 2.548f)
                arcTo(2.996f, 2.996f, 0f, false, true, 15f, 8f)
                close()
                moveToRelative(-3.291f, -2.843f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.135f, 1.052f)
                lineToRelative(-4.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.151f, 0.043f)
                lineToRelative(-2.25f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.114f, -1.004f)
                lineToRelative(1.65f, 1.832f)
                lineToRelative(3.7f, -4.789f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.052f, -0.134f)
                close()
            }
        }.build()
        
        return _CheckBadge!!
    }

private var _CheckBadge: ImageVector? = null

